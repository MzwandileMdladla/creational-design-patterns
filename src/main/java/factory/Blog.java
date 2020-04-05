package factory;

/**
 * @author mzwandile on 2020/04/05
 * @project design patterns
 */
public class Blog extends Website {
    @Override
    protected void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
