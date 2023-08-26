package oops;

    public class Wall {
        private double width;
        private double height;

        public Wall() {

        }

        public void setWidth(double width) {
            this.width = width;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public Wall(double width, double height) {
            if (width < 0.0) {
                this.width = 0;
            }
            if (height < 0.0) {
                this.height = 0;
            }
            this.width = width;
            this.height = height;

        }

        public double getArea()
        {
            return this.height*this.width;
        }
    }
