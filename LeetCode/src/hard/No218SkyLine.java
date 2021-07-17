package hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class No218SkyLine {

    private static void getResult(List<Building> cityBuildings, List<List<Integer>> resultList) {
        Map<Integer, List<Integer>> points = new TreeMap<>();
        for (Building building : cityBuildings) {
            handleBuildingPoint(building, cityBuildings, points);
        }
        for (Map.Entry<Integer, List<Integer>> entry : points.entrySet()) {
            resultList.add(entry.getValue());
        }
    }

    private static void handleBuildingPoint(Building building, List<Building> cityBuildings, Map<Integer, List<Integer>> points) {
        int leftX = building.leftX;
        int heightY = building.heightY;
        int rightX = building.rightX;

        boolean isNeedLeftTop = true;
        boolean isNeedRightBottom = true;
        boolean isNeedRightTop = true;
        int rightY = 0;
        for (Building cityBuilding : cityBuildings) {
            if (cityBuilding != building && isInRangeX(cityBuilding,building)) {
                if (cityBuilding.leftX < leftX && cityBuilding.rightX > leftX) {
                    if (cityBuilding.heightY > heightY) {
                        isNeedLeftTop = false;
                    }
                    if (cityBuilding.rightX > rightX) {
                        isNeedRightBottom = false;
                    }
                }

                if (cityBuilding.leftX <= rightX && cityBuilding.rightX > rightX) {
                    if (cityBuilding.heightY > heightY) {
                        isNeedRightTop = false;
                        isNeedRightBottom = false;
                    } else if (cityBuilding.heightY > rightY) {
                        rightY = cityBuilding.heightY;
                        isNeedRightBottom = false;
                    }
                }

                if (cityBuilding.heightY == heightY) {
                    if (cityBuilding.rightX == leftX) {
                        isNeedLeftTop = false;
                    }
                    if (cityBuilding.leftX == rightX) {
                        isNeedRightTop = false;
                        isNeedRightBottom = false;
                        rightY = heightY;
                    }
                    if(cityBuilding.leftX<= leftX){
                        isNeedLeftTop = false;
                    }
                    if(cityBuilding.rightX>= rightX){
                        isNeedRightTop = false;
                        isNeedRightBottom = false;
                    }
                }

                if(cityBuilding.leftX == leftX && cityBuilding.rightX == rightX){
                    if(cityBuilding.heightY > heightY){
                        isNeedLeftTop = false;
                        isNeedRightBottom = false;
                    }
                }

                if(cityBuilding.leftX == leftX && cityBuilding.rightX != rightX){
                    if(cityBuilding.heightY > heightY){
                        isNeedLeftTop = false;
                    }
                }
                if(cityBuilding.rightX == rightX && cityBuilding.leftX != leftX){
                    if(cityBuilding.heightY > heightY){
                        isNeedRightBottom = false;
                        isNeedRightTop = false;
                    }
                }
            }
        }
        if (isNeedLeftTop) {
            if(points.containsKey(leftX) && points.get(leftX).get(1) > heightY) {
                points.put(leftX, getNewPoint(leftX, heightY));
            }else{
                points.put(leftX, getNewPoint(leftX, heightY));
            }
        }
        if (isNeedRightTop) {
            if(points.containsKey(rightX) && points.get(rightX).get(1) > heightY) {
                points.put(rightX, getNewPoint(rightX, rightY));
            }else{
                points.put(rightX, getNewPoint(rightX, rightY));
            }
        }
        if (isNeedRightBottom) {
            if(points.containsKey(rightX) && points.get(rightX).get(1) > heightY) {
                //
            }else{
                points.put(rightX, getNewPoint(rightX, 0));
            }
        }
    }

    private static boolean isInRangeX(Building cityBuilding, Building building) {
        return (building.rightX <= cityBuilding.rightX && building.rightX >= cityBuilding.leftX)
                || (building.leftX >= cityBuilding.leftX && building.leftX <= cityBuilding.rightX);
    }

    private static List<Integer> getNewPoint(int x, int y) {
        List<Integer> newPoint = new ArrayList<>();
        newPoint.add(x);
        newPoint.add(y);
        return newPoint;
    }

    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (null != buildings && buildings.length > 0) {
            List<Building> cityBuildings = new ArrayList<>();
            for (int[] building : buildings) {
                updatecityBuildings(cityBuildings, building);
            }
            getResult(cityBuildings, resultList);
        }

        return resultList;
    }

    private void updatecityBuildings(List<Building> cityBuildings, int[] building) {
        if (null != building && building.length == 3) {
            int left = building[0];
            int right = building[1];
            int height = building[2];
            Building building1 = new Building(left, right, height);
            if(!isExistsBuild(cityBuildings,building1)) {
                cityBuildings.add(building1);
            }
        }
    }

    private boolean isExistsBuild(List<Building> cityBuildings, Building building1) {
        for(Building building:cityBuildings){
            if(building.equals(building1)){
                return true;
            }
        }
        return false;
    }


    public class Building {
        public int leftX;
        public int rightX;
        public int heightY;

        public Building(int left, int right, int height) {
            leftX = left;
            rightX = right;
            heightY = height;
        }

        public boolean equals(Building building){
            return leftX==building.leftX && rightX == building.rightX && building.heightY == heightY;
        }

    }
}
