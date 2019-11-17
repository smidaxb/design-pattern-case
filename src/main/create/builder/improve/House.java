package main.create.builder.improve;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/16
 */
public class House {
    private String basic;

    private String wall;
    private String roof;

    public static Builder builder() {
        return new Builder();
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    static class Builder {
        private House house;

        public House.Builder basic(String basic) {
            if (null == house) {
                house = new House();
            }
            house.setBasic(basic);
            return this;
        }

        public House.Builder wall(String wall) {
            if (null == house) {
                house = new House();
            }
            house.setWall(wall);
            return this;
        }

        public House.Builder roof(String roof) {
            if (null == house) {
                house = new House();
            }
            house.setRoof(roof);
            return this;
        }

        public House build() {
            return house;
        }
    }
}
