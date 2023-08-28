package gr.aueb.cf.ch16.askisi1;

public abstract class AbstractShape implements IShape{
    private Long id;


    public void setId(long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }
}
