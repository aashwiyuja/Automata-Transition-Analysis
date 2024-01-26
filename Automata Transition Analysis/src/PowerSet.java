import java.util.ArrayList;
import java.util.List;

public class PowerSet {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    subsetsHelper(list, new ArrayList<>(), nums, 0);
    return list;
  }

  private void subsetsHelper(
      List<List<Integer>> list, List<Integer> resultList, int[] nums, int start) {
    list.add(new ArrayList<>(resultList));
    for (int i = start; i < nums.length; i++) {
      // add element
      resultList.add(nums[i]);
      // Explore
      subsetsHelper(list, resultList, nums, i + 1);
      // remove
      resultList.remove(resultList.size() - 1);
    }
  }
}
