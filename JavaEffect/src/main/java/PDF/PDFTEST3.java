package PDF;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.UnitValue;
import org.apache.commons.math3.analysis.function.Identity;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PDFTEST3 {
    public static void main(String[] args) throws IOException {
        //1. 크롤링
        CrawlingEnter crawlingEnter = new CrawlingEnter();
        Elements elements = crawlingEnter.getElements();

        for(Element e : elements){
            System.out.println(e.text());
        }

        //2. 엑셀 생성
        int count =1; //번호
        // XSSWorkbook -> Sheet -> Row ->createRow();
        XSSFWorkbook workbook = new XSSFWorkbook(); //엑셀 워크북 객체 생성
        //sheet 생성
        Sheet sheet = workbook.createSheet("엔터 뉴스");
        //헤더 생성
        Row headRow = sheet.createRow(0);
        headRow.createCell(0).setCellValue("번호");
        headRow.createCell(1).setCellValue("타이틀");
        headRow.createCell(2).setCellValue("url");

        //데이터 엑셀에 넣기
        for(Element e : elements){
            Row r = sheet.createRow(count);
            r.createCell(0).setCellValue(count++);
            r.createCell(1).setCellValue(e.text());
            r.createCell(2).setCellValue(e.select("a").attr("href"));
        }

        String fileName = "enter.xlsx";
        //FileOutputStream 객체 생성
        FileOutputStream outputStream = new FileOutputStream(new File(fileName));
        //workbook과 FileOutputStream 연결
        workbook.write(outputStream);
        //완성되면 workbook 닫기
        workbook.close();
        //PDF 생성
        //PdfWriter -> PdfDocument -> Document -> Table -> Cell(Paragraph) ->addCell
        PdfWriter writer = new PdfWriter("enter.pdf");
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf, PageSize.A4); //A4 사이즈

        //Font Set
        PdfFont headerFont = null;
        PdfFont bodyFont = null;

        headerFont = PdfFontFactory.createFont("나눔손글씨 다시 시작해.ttf", "Identity-H");
        bodyFont = PdfFontFactory.createFont("나눔손글씨 다시 시작해.ttf", "Identity-H");

        //실수 배열 생성 -> 테이블 생성
        float[] columnWidths = {1,2,2}; //컬럼 넓이
        Table table = new Table(UnitValue.createPointArray(columnWidths)); //테이블 넓이 위에 배열 참조
        table.setWidth(UnitValue.createPercentValue(100));

        //테이블 헤더 -> 셀
        Cell hCell1 = new Cell().add(new Paragraph("순번")).setFont(headerFont);
        Cell hCell2 = new Cell().add(new Paragraph("타이틀")).setFont(headerFont);
        Cell hCell3 = new Cell().add(new Paragraph("URL")).setFont(headerFont);
        table.addHeaderCell(hCell1);
        table.addHeaderCell(hCell2);
        table.addHeaderCell(hCell3);

        int rowNum = 1;
        for(Element e : elements){
            Cell rowNumCell = new Cell().add(new Paragraph(String.valueOf(rowNum))).setFont(bodyFont);
            //table 추가
            table.addCell(rowNumCell);
            //cell 2번
            Cell titleCell = new Cell().add(new Paragraph(e.text())).setFont(bodyFont);
            //table 추가
            table.addCell(titleCell);
            //cell 3번
            Cell URLCell = new Cell().add(new Paragraph(e.select("a").attr("href"))).setFont(bodyFont);
            //table 추가
            table.addCell(URLCell);

            rowNum++;
        }
        document.add(table); //문서에 추가 table(모든 정보)
        document.close(); //close() 문서가 진짜 써짐

    }
}
