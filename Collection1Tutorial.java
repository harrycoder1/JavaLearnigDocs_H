import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Collection1Tutorial {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>() ;
        // collection not support the index value funtion but List suuport the index value function
        // List<Integer> nums = new ArrayList<Integer>() ;
        // Set<Integer> nums = new HashSet<Integer>(); // it not support duplicate value and it will not give the sorted value
        Set<Integer> nums = new TreeSet<Integer>(); // it not support duplicate value and it will  give the sorted value

// System.out.println(nums.get(1));
// System.out.println(nums.indexOf(2));

        nums.add(3) ;
        nums.add(2) ;
        nums.add(8) ;
        nums.add(10) ;
        nums.add(2) ; //it List  support duplicate value
        System.out.println(nums);

        for (int  n : nums) {
            System.out.println(n);
        }

        //Iteratoer class
        // Iterator<Integer> value = nums.iterator() ;
        // System.out.println(value);

    }
}
