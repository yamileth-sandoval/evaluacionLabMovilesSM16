package Entidades;

public class Estudiante {
    private String nombre;
    private String codigo;
    private String materia;
    private Double parcial1;
    private Double parcial2;
    private Double parcial3;
    private Double promedio;
    private int id;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setParcial1(Double parcial1) {
        this.parcial1 = parcial1;
    }

    public Double getParcial1() {
        return parcial1;
    }

    public void setParcial2(Double parcial2) {
        this.parcial2 = parcial2;
    }

    public Double getParcial2() {
        return parcial2;
    }

    public void setParcial3(Double parcial3) {
        this.parcial3 = parcial3;
    }

    public Double getParcial3() {
        return parcial3;
    }

    public void setPromedio() {
        Double aux = (this.parcial1*0.3)+(this.parcial2*0.3)+(this.parcial3*0.4);
        this.promedio=Math.round(aux*100)/100d;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
