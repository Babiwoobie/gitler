public class Trans {
    private int speed;
    private float weight;
    private String color;
    private byte[] coordinate;

    public Trans(int _speed, float _weight, String _color, byte[]_coordinate) {
        setval(_speed, _weight, _color, _coordinate);
        System.out.println(getval());
    }


    public void setval(int _speed, float _weight, String _color, byte[]_coordinate) {
        speed=_speed;
        weight=_weight;
        color=_color;
        coordinate=_coordinate;
    }


    public String getval() {
        String inf = speed + " " + " " + weight + " " + color + " " + coordinate;
        String infcor ="\n";
        for(int i =0; i<coordinate.length; i++) {
            inf+=coordinate[i];
        }
        return inf + infcor;
    }
}
