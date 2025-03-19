package Excel;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcelReadTest {
    public static void main(String[] args) {
        try{
            //파일을 받기 위한 FileInputStream 객체 생성
            FileInputStream file = new FileInputStream(new File("example.xlsx"));
            // WorkbookFactory 생성 -> FileInputStream 객체를 받아서 생성 -> workbook
            Workbook workbook = WorkbookFactory.create(file);
            //workbook -> 0번재 sheet의 객체를 생성해서 sheet 변수에 대입
            Sheet sheet = workbook.getSheetAt(0);//getSheetAt 제일 앞에있는 시트(0번째)
            //sheet - > Row 행 추출 반복
            for(Row row :sheet){
                //Row - >cell 열 추출 반복
                for(Cell cell : row){ //시트에서 row 빼줌.
                    // cell의 타입으로 분기
                    switch (cell.getCellType()){
                        case NUMERIC : // 숫자
                            // cell의 값이 날짜이면 실행
                            if(DateUtil.isCellDateFormatted(cell)){
                                Date dateValue = cell.getDateCellValue(); //날짜 데이터로 받습니다.
                                // 양식 yyyy-mm-dd로 세팅합니다
                                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                //날자 데이터를 양식에 맞게 변경해서 문자열로 리턴을 해줍니다.
                            }else{  //날짜가 아니면 실행
                                //getNumericCellValue 값을 받으면 실수 값이 나옵니다.
                                double numericValue = cell.getNumericCellValue();
                                // 실수 값 numericValue == Math.floor(numericValue) 소숫점 값 X
                                if(numericValue == Math.floor(numericValue)){ //Math.floor() (소숫점 버린 숫자) 정수일때, 라는 뜻
                                    int intValue = (int) numericValue; //정수로 형 변환
                                    System.out.print(intValue + "\t"); //출력
                                }else{
                                    //실수 값으로 출력
                                    System.out.print(numericValue+"\t");

                                }
                            }
                            break;
                        case STRING: //문자열
                            String stringValue = cell.getStringCellValue();
                            System.out.print(stringValue+"\t");
                            break;
                        case BOOLEAN: //불리언
                            boolean booleanValue = cell.getBooleanCellValue();
                            System.out.print(booleanValue+"\t");
                            break;
                        case FORMULA: //엑셀 공식이 있는 경우
                            String formulaValue = cell.getCellFormula();
                            System.out.print(formulaValue+"\t");
                            break;
                        case BLANK: //비어있는 경우
                            System.out.print("\t");
                            break;
                        default:
                            //위에 조건에 맞는게 없는 경우
                            System.out.print("\t");
                            break;
                    }
                }
                System.out.println();
            }
            file.close(); //파일 닫기
            System.out.println("엑셀에서 데이터 읽어 오기 성공"); //출력
        } catch (IOException e) { //읽다가 문제가 생기면 catch로 들어감.
            throw new RuntimeException(e);
        }
    }

}

