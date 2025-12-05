import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String normalized = paragraph.replaceAll("[!?',;\\.]", " ").toLowerCase();
        String[] words = normalized.split("\\s+");
        
        Set<String> bannedSet = new HashSet<>();
        for (String b : banned) bannedSet.add(b);
        
        Map<String, Integer> count = new HashMap<>();
        String best = "";
        int bestCount = 0;
        
        for (String w : words) {
            if (w.length() == 0 || bannedSet.contains(w)) continue;
            int c = count.getOrDefault(w, 0) + 1;
            count.put(w, c);
            if (c > bestCount) {
                bestCount = c;
                best = w;
            }
        }
        return best;
    }
}
