package nestedPojoPractice;

public class TestingNested {
    public static void main(String[]args){
        nested nested= new nested();
        nested.setId("1");
        nested.setType("icecream");
        nested.setName("Vanilla Cone");

        image image= new image();
        image.setUrl("//sss0");
        image.setWidth(200);
        image.setHeight(200);

        nested.setImage(image);

        thumbnail thumbnail= new thumbnail();
        thumbnail.setUrl("//images/thumbnails");
        thumbnail.setWidth(32);
        thumbnail.setHeight(32);

        nested.setThumbnail(thumbnail);




        System.out.println(nested.toString());
    }
}
