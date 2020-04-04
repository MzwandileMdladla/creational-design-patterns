package builder;

import lombok.Getter;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@Getter
public class BuilderLunchOrder {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public BuilderLunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {
        }

        public BuilderLunchOrder build() {
            return new BuilderLunchOrder(this);
        }

        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder setCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder setDressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder setMeat(String meat) {
            this.meat = meat;
            return this;
        }
    }
}
