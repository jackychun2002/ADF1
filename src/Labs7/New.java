package Labs7;

import java.util.Scanner;

public class New implements INews{
    int id;
    String title;
    String publishDate;
    String author;
    String content;
    float  averageRate;

    int[] reteLish = new int[3];
    public New(){
    }

    public New(int id,String title,String publishDate,String author,String content,float averageRate){
        this.id = id;
        this.publishDate =publishDate;
        this.title = title;
        this.author = author;
        this.content = content;
        this.averageRate =averageRate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAverageRate(float averageRate) {
        this.averageRate = averageRate;
    }
    @Override
    public void display(){
        System.out.println("title:"+getTitle());
        System.out.println("publish date:"+getPublishDate());
        System.out.println("author:"+getAuthor());
        System.out.println("content:"+getContent());
        System.out.println("avg rate:"+getAverageRate());
    }
    public void calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 Gia Tri:");
        for (int i=0;i<reteLish.length;i++){
            reteLish[i] = sc.nextInt();
        }for (int i=0 ;i < reteLish.length; i++){
            this.averageRate += reteLish[i];
        }
        this.averageRate = averageRate/3;
    }
}
