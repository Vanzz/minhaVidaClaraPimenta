public class UtilitariosHeap
{
    private UtilitariosHeap() { }

    private static int esq(int i)
    {
        return i*2;
    }

    private static int dir(int i)
    {
        return (i*2)+1;
    }

    public static boolean verificarHeap(Comparable[] arr)
    {
        if (arr[0] != null)
        {
            return false;
        }

        for (int i = 1; i < arr.length/2; i++)
        {
            if (arr[i].compareTo(arr[esq(i)]) < 0 || arr[i].compareTo(arr[dir(i)]) < 0)
            {
                return false;
            }
        }

        return true;
    }
}
