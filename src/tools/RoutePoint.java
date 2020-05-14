package tools;

import java.util.List;

public class RoutePoint {

    private List<Point> pointList;

    public RoutePoint(List<Point> pointList) {
        this.pointList = pointList;
    }

    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList (List<Point> pointList) {
        this.pointList = pointList;
    }
}

