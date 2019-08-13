import array.Array;
import array.ArrayImpl;
import org.junit.*;

public class TestArrayChecker {
    Array<Integer> arr;
    @Before
    public void init(){
        arr = new ArrayImpl<Integer>();
        arr.add(5);
        arr.add(2);
        arr.add(1);
        arr.add(56);
        arr.add(0);
    }

    @Test
    public void testRemoveByIndexArray(){
        Assert.assertTrue("Такого индекса нет",arr.removeByIndex(1));
    }

    @Test
    public void testRemoveByValue(){
        Assert.assertTrue("Такого значения нет",arr.removeByValue(5));
    }

    @Test
    public void testLen(){
        Assert.assertEquals(5,arr.len());
    }

    @Test
    public void testIndexOf(){
        Assert.assertEquals(3,arr.indexOf(56));
    }

    @Test
    public void testContains(){
        Assert.assertTrue("Такого значения нет",arr.contains(5));
    }
}
