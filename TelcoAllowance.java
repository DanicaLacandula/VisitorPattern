import java.util.HashMap;

public class TelcoAllowance implements UsagePromo {
    private HashMap<String, String> dataAllowanceMap = new HashMap<>() {{
        put("Smart", "15 GB");
        put("Globe", "10 GB");
        put("Ditto", "8 GB");
    }};
    
    @Override
    public String showAllowance(String telcoName, double price) {
        return dataAllowanceMap.getOrDefault(telcoName, "Unknown data allowance") 
               + " for ₱" + price + " per month";
    }
}