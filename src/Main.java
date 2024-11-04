import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rafael\",\"idade\":19,\"cidade\":\"Sao Paulo\"}";

        Gson gson = new GsonBuilder().setLenient().create();

        Pessoa minhaPessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + minhaPessoa);
    }
}