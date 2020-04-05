package factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mzwandile on 2020/04/05
 * @project design patterns
 */
@Slf4j
public class FactoryDemo {
    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        log.debug(String.valueOf(website.getPages()));

        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        log.debug(String.valueOf(website.getPages()));
    }
}
