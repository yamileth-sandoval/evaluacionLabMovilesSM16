package Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.evaluacionlabmovilessm16.R;
import java.util.List;

import Entidades.Estudiante;

public class adaptadorEstudiante extends BaseAdapter {
    private List<Estudiante> datasource;
    private Context cntx;
    private int IdLayoutPlantilla;

    public List<Estudiante> GetData(){
        return this.datasource;
    }
    /**
     * Constructor que permite inicializar las variables de la clase
     * @param context
     * @param IdPlantilla
     * @param sources
     */

    public adaptadorEstudiante(Context context, int IdPlantilla, List<Estudiante> sources){
        //Inicializamos las variables
        this.cntx = context;
        this.IdLayoutPlantilla = IdPlantilla;
        this.datasource = sources;
    }

    @Override
    public int getCount() {
        return this.datasource.size();
    }

    @Override
    public Estudiante getItem(int position) {
        return this.datasource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            //Creamos el Administrador de Layout
            LayoutInflater inflater = (LayoutInflater) this.cntx.getSystemService(this.cntx.LAYOUT_INFLATER_SERVICE);
            //Le damos vida al archivo xml ahora es un Layout
            convertView = inflater.inflate(this.IdLayoutPlantilla,null);

            //Buscamos los controles de nuestra plantilla
            TextView labelNombre = convertView.findViewById(R.id.lblNombre);
            TextView labelCodigo = convertView.findViewById(R.id.lblCodigo);
            TextView labelMateria = convertView.findViewById(R.id.lblMateria);
            TextView labelPromedio = convertView.findViewById(R.id.lblPromedio);
            TextView labelId = convertView.findViewById(R.id.lblID);

            //Obtenemos el dato a mostrar
            labelNombre.setText(this.datasource.get(position).getNombre());
            labelCodigo.setText(this.datasource.get(position).getCodigo());
            labelMateria.setText(this.datasource.get(position).getMateria());
            labelPromedio.setText(String.valueOf(this.datasource.get(position).getPromedio()));
            labelId.setText(String.valueOf(this.datasource.get(position).getId()));
        }
        return convertView;
    }
}
