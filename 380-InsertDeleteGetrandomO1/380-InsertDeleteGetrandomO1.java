// Last updated: 09/07/2026, 09:12:18
class RandomizedSet {
    private List<Integer> list;
    private Map<Integer, Integer> map;
    private Random random;
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int lastElement = list.get(list.size() - 1);
        int indexToRemove = map.get(val);
        list.set(indexToRemove, lastElement);
        map.put(lastElement, indexToRemove);
        list.remove(list.size() - 1);
        map.remove(val);  
        return true;
    }
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
