package codeofli.leetcode.graph_parse_ds.data_structure;

public class ReverseLeftWords58 {
    public String reverseLeftWords(String s, int n) {
        n %= s.length();
        return s.substring(n) +  s.substring(0,n);
    }
}
