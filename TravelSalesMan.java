public class TravelSalesMan {

    public static void TravelSalesManAlgo(int[][] distanceMatrix){
        int numberOfCities = distanceMatrix.length;

        boolean[] visited = new boolean[numberOfCities];
        visited[0] = true;

        int[] tour = new int[numberOfCities];
        tour[0] = 0;

        int distanceTravel = 0;

        for(int i=1;i<numberOfCities;i++){
            int nearestCity = -1;
            int minDistance = Integer.MAX_VALUE;
            for(int j=0;j<numberOfCities;j++){
                if(!visited[j] && distanceMatrix[tour[i-1]][j] < minDistance){
                    nearestCity = j;
                    minDistance = distanceMatrix[tour[i-1]][j];
                }
            }
            tour[i] = nearestCity;
            visited[nearestCity] = true;
            distanceTravel += minDistance;

        }
        distanceTravel += distanceMatrix[tour[numberOfCities - 1]][0];

        System.out.println("Tour");
        for(int i=0;i<numberOfCities;i++){
            System.out.print(tour[i] + " -> ");
        }
        System.out.println("0");

        System.out.println(distanceTravel);
    }
    public static void main(String[] args) {
        int[][] distanceMatrix = {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };
        TravelSalesManAlgo(distanceMatrix);
    }
}
