package com.basic.UML;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.Doc;

public class DependencyEX {

    public static void main(String[] args) {
        Document doc = new Document("Dependency Example Document");
        Printer print = new Printer();
        print.print(doc);
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Document {

    private String Content;

}

class Printer {

    public void print(Document doc){
        System.out.println("Printing Document " + doc.getContent());
    }
}
