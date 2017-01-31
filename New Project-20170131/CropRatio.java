/**
 * Crop Ratio class 
 * 
 * @author Frances Blendermann
 */
import java.util.HashMap;

public class CropRatio {
    private int totalWeight =0;
    private HashMap<String, Integer> crops = new HashMap<String, Integer>();

    public void add(String name, int cropWeight) {
        Integer currentCropWeight = crops.get(name);

        if (currentCropWeight == null) {
            crops.put(name, cropWeight);
        } else {
            crops.put(name, currentCropWeight+cropWeight);
        }
        //cropWeight += cropWeight;
        totalWeight += cropWeight;
        System.out.println(totalWeight+" "+crops.get(name));
    }

    public double proportion(String name) {
        return (double) crops.get(name) / totalWeight;
    }

    public static void main(String[] args) {
        CropRatio cropRatio = new CropRatio();

        cropRatio.add("Wheat", 4);
        cropRatio.add("Wheat", 5);
        cropRatio.add("Rice", 1);

        System.out.println("Fraction of wheat: " + cropRatio.proportion("Wheat"));
    }
}