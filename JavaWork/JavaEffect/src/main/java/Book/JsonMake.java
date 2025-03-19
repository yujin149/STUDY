package Book;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;

public class JsonMake {
    public static ArrayList<Book> stringtoJson(StringBuilder content){
        //1. Gson 객체 생성
        Gson gson = new Gson();
        //2. 문자열 -> JSON 객체
        JsonObject jsonObject = gson.fromJson(content.toString(),  JsonObject.class);
        System.out.println(jsonObject);
        //3. JSON 객체 -> documents : [] -> JSONArray
        JsonArray jsonArray = jsonObject.getAsJsonArray("documents");
        System.out.println(jsonArray);
        //ArrayList 객체 생성
        ArrayList<Book> books = new ArrayList<>();
        //JsonArray ->JsonElement
        //데이터가 없을때까지
        for(JsonElement je : jsonArray){
            //JsonElement -> JsonObject
            JsonObject jo = je.getAsJsonObject();
            //Book 객체 생성
            Book book = new Book();
            if(jo.get("title" )!= null){
                book.setTitle(jo.get("title").getAsString());
            }
            if(jo.get("sale_price") != null){
                book.setPrice(jo.get("sale_price").getAsInt());
            }
            if(jo.get("publisher") != null){
                book.setPublisher(jo.get("publisher").getAsString());
            }
            if(jo.get("thumbnail") != null){
                book.setThumbnail(jo.get("thumbnail").getAsString());
            }
            if(jo.get("authors") != null){
                JsonArray ja = jo.get("authors").getAsJsonArray();
                String result = "";
                for(JsonElement e : ja){
                    result += e.getAsString()+" ";
                }
                book.setAuthors(result);
            }
            books.add(book);
        }
        for(Book b : books){
            System.out.println(b);
        }
        return books;
    }
}
