package blogpost;

public class BlogPost {
    private String authonName;
    private String title;
    private String text;
    private String publicationDate;

    public BlogPost(String authonName, String title, String text, String publicationDate) {
        this.authonName = authonName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }
}
