package adapter.map;

public class MapAdapterTest
{
  public static void main(String[] args)
  {
    int[][] array = new int[2][4];
    
    array[0][0] = 1;
    array[0][1] = 2;
    array[0][2] = 3;
    array[0][3] = 4;
    
    array[1][0] = 100;
    array[1][1] = 200;
    array[1][2] = 300;
    array[1][3] = 400;
    
    MapAdapter map = new MapAdapter(array);
    System.out.println(map.toString());
  }
}
