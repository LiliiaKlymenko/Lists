package XML_task;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Liliia_Klymenko on 07-May-15.
 */
public class Json {

    public static void main(String[] args) {

        JSONObject plane = new JSONObject();
        plane.put("model", "BigPlane");
        plane.put("origin", "Ukraine");
        plane.put("price", new Double(67000000.50));

        JSONArray chars = new JSONArray();

        chars.add("Freight");
        chars.add(new Integer(15));
        chars.add(new Integer(10));
        chars.add(new Integer(300));
        chars.add(new Boolean(true));

        plane.put("Characters", chars);

        JSONArray params = new JSONArray();
        params.add(new Double(30.0));
        params.add(new Double(12.0));
        params.add(new Double(4.5));


        plane.put("Parameters", params);

        try {

            FileWriter file = new FileWriter("json.json");
            file.write(plane.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(plane);

    }
}
