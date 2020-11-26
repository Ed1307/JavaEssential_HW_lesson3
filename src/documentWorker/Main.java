package documentWorker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ключ доступа");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        switch(key){
            case 123: {
                ExpertDocumentWorker exp = new ExpertDocumentWorker();
                exp.openDocument();
                exp.editDocument();
                exp.saveDocument();
                break;
            }
            case 12: {
                ProDocumentWorker pro = new ProDocumentWorker();
                pro.openDocument();
                pro.editDocument();
                pro.saveDocument();
                break;
            }
            default:{
                DocumentWorker d = new DocumentWorker();
                d.openDocument();
                d.editDocument();
                d.saveDocument();
            }
        }
    }
}
