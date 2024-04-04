package nestedPojoPractice;

public class nested {

    //{
    //	"id": "1",
    //	"type": "icecream",
    //	"name": "Vanilla Cone",
    //	"image":
    //		{
    //			"url": "img/01.png",
    //			"width": 200,
    //			"height": 200
    //		},
    //	"thumbnail":
    //		{
    //			"url": "images/thumbnails/01.png",
    //			"width": 32,
    //			"height": 32
    //		}
    //}

    private String id;
    private String type;
    private String name;
    private image image;

    public thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    private thumbnail thumbnail;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public image getImage() {
        return image;
    }

    public void setImage(image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "nested{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", image=" + image.toString() +
                ", thumbnail=" + thumbnail.toString() +
                '}';
    }
}


