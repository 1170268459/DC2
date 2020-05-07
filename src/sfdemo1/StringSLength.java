package sfdemo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: cjq
 * @time: 2020/5/7 13:39
 */

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class StringSLength {

    /**
     *
     * 使用滑动窗口来解决该问题
     *
     * @param s
     * @return
     */
    public int LengthOfLongestSubstring(String  s){
        int n=s.length(),ans=0;
        Map<Character,Integer> map=new HashMap<>();
        for (int end = 0,start=0; end <n ; end++) {
            char alpha=s.charAt(end);

            /**
             * 如何map的key值比较返回true，则直接更改起始位置
             */
            if (map.containsKey(alpha)){
                start=Math.max(map.get(alpha),start);
            }
            ans=Math.max(ans,end-start+1);
            map.put(s.charAt(end),end+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        StringSLength stringSLength=new StringSLength();
        int i = stringSLength.LengthOfLongestSubstring("abcabcbb");
        System.out.printf(String.valueOf(i));

    }
}