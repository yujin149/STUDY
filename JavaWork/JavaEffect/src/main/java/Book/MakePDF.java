package Book;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.UnitValue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class MakePDF {
    public static void makePDF(ArrayList<Book> books, String input) throws IOException {
        //PDF -> Document 객체 생성
        PdfWriter writer = new PdfWriter(input+".pdf");
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf, PageSize.A4); // A4 사이즈

        PdfFont headerFont = null;
        PdfFont bodyFont = null;

        headerFont = PdfFontFactory.createFont("나눔손글씨 다시 시작해.ttf",
                "Identity-H");
        bodyFont = PdfFontFactory.createFont("나눔손글씨 다시 시작해.ttf",
                "Identity-H");

        // 실수 배열 생성 -> 테이블 생성
        float[] columnWidths = {2, 2, 2, 2, 2}; // 컬럼 넓이
        Table table = new Table(UnitValue.createPercentArray(columnWidths)); //테이블 넓이 위에 배열 참조
        table.setWidth(UnitValue.createPercentValue(100));

        // 테이블 헤더 -> 셀
        Cell hCell1 = new Cell().add(new Paragraph("타이틀")).setFont(headerFont);
        Cell hCell2 = new Cell().add(new Paragraph("저자")).setFont(headerFont);
        Cell hCell3 = new Cell().add(new Paragraph("출판사")).setFont(headerFont);
        Cell hCell4 = new Cell().add(new Paragraph("가격")).setFont(headerFont);
        Cell hCell5 = new Cell().add(new Paragraph("썸네일")).setFont(headerFont);
        table.addHeaderCell(hCell1);
        table.addHeaderCell(hCell2);
        table.addHeaderCell(hCell3);
        table.addHeaderCell(hCell4);
        table.addHeaderCell(hCell5);

        for(Book b : books){
            String title = b.getTitle();
            String authors =b.getAuthors();
            String publisher = b.getPublisher();
            Integer price= b.getPrice();
            String thumbnail = b.getThumbnail();

            Cell titleCell = new Cell().add(new Paragraph(title)).setFont(headerFont);
            table.addCell(titleCell);
            Cell authorsCell = new Cell().add(new Paragraph(authors)).setFont(headerFont);
            table.addCell(authorsCell);
            Cell publisherCell = new Cell().add(new Paragraph(publisher)).setFont(headerFont);
            table.addCell(publisherCell);
            Cell priceCell = new Cell().add(new Paragraph(price.toString())).setFont(headerFont);
            table.addCell(priceCell);

            //이미지 썸네일 주소 -> ImageData 변경
            ImageData imageData = ImageDataFactory.create(new URL(thumbnail));
            //ImageData -> Image
            Image image = new Image(imageData);
            //image -> Cell에다 넣어줘야합니다.
            Cell imageCell = new Cell().add(image.setAutoScale(true));
            table.addCell(imageCell);
        }

        document.add(table);
        document.close();




    }
}
