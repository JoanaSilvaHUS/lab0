/**
 * Enumeração Size - Tamanhos existentes
 * 
 * @author 202100242 e 202100190
 * @version 08/03/2022
 */
public enum Size
{
    SMALL(32, 36, "Pequeno",'S'),
    MEDIUM(37, 44, "Médio",'M'),
    LARGE(45, 52, "Grande",'L');
    
    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;
    
    /**
     * Criação do objeto Size
     * @param minValue - Valor mínimo
     * @param maxValue - Valor máximo
     * @param description - Descrição
     * @param code - Código
     */
    private Size(int minValue, int maxValue, String description, char code)
    {
        this.description = description;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.code = code;
    }
    
    /**
     * Mostra em String a descrição do tamanho
     * @return A descrição do tamanho
     */
    @Override
    public String toString()
    {
        return this.description;
    }
    
    /**
     * Retorna a descrição do tamanho
     * @return A descrição do tamanho
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Retorna o valor mínimo do tamanho
     * @return O valor mínimo do tamanho
     */
    public int getMinValue()
    {
        return minValue;
    }
    
    /**
     * Retorna o valor máximo do tamanho
     * @return O valor máximo do tamanho
     */
    public int getMaxValue()
    {
        return maxValue;
    }
    
    /**
     * Retorna o código do tamanho
     * @return O código do tamanho
     */
    public char getCode()
    {
        return code;
    }
}


