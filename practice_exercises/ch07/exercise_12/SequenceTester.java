public class SequenceTester
{
    public static void main(String[] args)
    {
        int[] A = { 1, 4, 9, 16, 7, 4, 9, 11 };
        int[] B = { 11, 11, 7, 9, 16, 4, 1 };
        
        Sequence sequence = new Sequence(A.length);
        Sequence other = new Sequence(B.length);
        
        for (int i = 0; i < A.length; i++)
        {
            sequence.set(i, A[i]);
        }
        
        for (int i = 0; i < B.length; i++)
        {
            other.set(i, B[i]);
        }
        
        System.out.println("Actual: " + sequence.sameValues(other));
        System.out.println("Expected: true");
        System.out.println();
        
        int[] C = { 9, 7, 4, 9, 11 };
        Sequence another = new Sequence(C.length);
        for (int i = 0; i < C.length; i++)
        {
            another.set(i, C[i]);
        }
        
        System.out.println("Actual: " + sequence.sameValues(another));
        System.out.println("Expected: false");
        System.out.println();
        
        int[] D = { 9, 7, 4, 16, 11, 3, 1, 7 };
        Sequence yetAnotherSequence = new Sequence(D.length);
        for (int i = 0; i < D.length; i++)
        {
            yetAnotherSequence.set(i, D[i]);
        }
        
        System.out.println("Actual: " + sequence.sameValues(yetAnotherSequence));
        System.out.println("Expected: false");
    }
}