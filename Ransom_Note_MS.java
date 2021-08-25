import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
    // Write your code here
    boolean ans = true;
    Map<String, Integer> magmap = new HashMap<String, Integer>();
    for(int i=0;i<magazine.size();i++)
    {
        Integer n = magmap.get(magazine.get(i));
        if(n==null)
        {
            magmap.put(magazine.get(i), 1);
        }
        else
            magmap.put(magazine.get(i), n+1);
    }
    
    for(int i=0;i<note.size();i++)
    {
        Integer k = magmap.get(note.get(i));
        if(k==null || magmap.get(note.get(i))==0)
        {
            ans = false;
            break;
        }
        else
            magmap.put(note.get(i), k-1);
    }
    
    if(ans==false)
        System.out.println("No");
    else
        System.out.println("Yes");
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}




// ////
// Map<String, Integer> magazineMap;
// boolean isValid;

// public Solution(String magazine, String note) {
//     magazineMap = new HashMap<String, Integer>();
//     isValid = true;

//     for (String word : magazine.split(" ")) {
//         Integer i = magazineMap.get(word);

//         if (i == null) {
//             magazineMap.put(word, 1);
//         } else {
//             magazineMap.put(word, i + 1);
//         }
//     }

//     for (String word : note.split(" ")) {
//         Integer i = magazineMap.get(word);

//         if (i == null || magazineMap.get(word) == 0) {
//             isValid = false;
//             break;
//         } else {
//             magazineMap.put(word, i - 1);
//         }
//     }
// }
// ////
