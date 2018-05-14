package adapter.map;

import java.util.ArrayList;
import java.util.HashMap;

public class MapAdapter
  extends HashMap<Integer, Integer>
{
  private int[][] array;
  private ArrayList<Integer> keys;
  private ArrayList<Integer> values;
  
  public MapAdapter(int[][] array)
  {
    this.array = array;
    this.keys = new ArrayList();
    this.values = new ArrayList();
    
    createArrays();
    build();
  }
  
  private void build()
  {
    for (int i = 0; i < this.keys.size(); i++) {
      put((Integer)this.keys.get(i), (Integer)this.values.get(i));
    }
  }
  
  private void createArrays()
  {
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < this.array[i].length; j++) {
        if (i == 0) {
          this.keys.add(Integer.valueOf(this.array[i][j]));
        } else if (i == 1) {
          this.values.add(Integer.valueOf(this.array[i][j]));
        }
      }
    }
  }
}
