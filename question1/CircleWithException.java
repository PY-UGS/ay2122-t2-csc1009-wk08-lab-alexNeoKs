class CircleWithException{
    int radius;
    final static double pi = 3.142;


    public CircleWithException(int r){
        this.radius = r;
    }

    public void setRadius(int r){
        if (r < 0) {
            throw new ArithmeticException("Access denied - You must set a positive number.");
        }
        else {
            this.radius = r;
        }
    }

    public int getRadius(){
        return this.radius;
    }

    public double getArea() throws Exception{

        double area = this.radius * this.radius * pi;

        if ( area > 1000) {
            throw new Exception("something");
        }
        else {
            return area;
        }

        
    }

    public double getDiameter(){
        return this.radius * this.radius;
    }

}