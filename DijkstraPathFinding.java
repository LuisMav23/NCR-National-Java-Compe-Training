public class DijkstraPathFinding {
    public static void main(String[] args){

    }

    public static int shortestPath(char[][] arr, int row, int column, char lastPos, int total){
        if (arr[row][column] == 'Y') return total;
        int u, d, l ,r;
        if (row - 1 >= 0 && lastPos != 'u' && arr[row - 1][column] != 'D') u = shortestPath(arr, row - 1, column, 'd', total);
        if (row + 1 < arr.length && lastPos != 'd' && arr[row + 1][column] != 'D') d = shortestPath(arr, row + 1, column, 'u', total);
    }
}