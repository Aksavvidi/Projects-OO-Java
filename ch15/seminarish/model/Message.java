package gr.aueb.cf.ch15.seminarish.model;

public class Message extends IdentifiableEntity {
    private String title;
    private String body;

    public Message () {}
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
}
