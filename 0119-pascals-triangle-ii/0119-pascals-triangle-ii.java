class Solution {
    public static Map<Integer,List<Integer>> buf = new HashMap<Integer,List<Integer>>();
    public static int maxRow = 0;
    
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = null;
        List<Integer> result = new ArrayList<Integer>();
        int start = maxRow;
        if(buf.containsKey(rowIndex)) return buf.get(rowIndex);
        result.add(1);

        for (int i = start; i <= rowIndex; i++) {
            prev = result;
            result = new ArrayList<Integer>();
            result.add(1);
            if(i > 0) {
                if(i > 1) result.add(i);
                if(buf.containsKey(i)) {
                    result = buf.get(i);
                } else {
                    int idx = i % 2 == 0 ? (i / 2) + 1 : (i + 1) / 2;
                    for (int j = 2; j < idx; j++) {
                        if(i % 2 == 1) {
                            result.add(prev.get(j - 1) + prev.get(j));
                        } else {
                            if(j == idx - 1) {
                                result.add(prev.get(j - 1) + prev.get(j - 1));
                            } else if(j < idx) {
                                result.add(prev.get(j - 1) + prev.get(j));
                            }
                        }
                    }
                    for (int j = result.size() - 1; j >= 0; j--) {
                        if(i % 2 == 0 && j == result.size() - 1) continue;
                        result.add(result.get(j));
                    }
                }
                buf.put(i, result);
                if(maxRow < rowIndex) maxRow = rowIndex;
            }
        }
        return result;
    }
}