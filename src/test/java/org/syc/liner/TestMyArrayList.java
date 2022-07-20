package org.syc.liner;

import org.syc.liner.MyArrayList;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMyArrayList {
    private MyArrayList<Integer> list;

    @BeforeMethod
    public void beforeMethod() {
        list = new MyArrayList<>();
        list.add(77);
        list.add(22);
        list.add(88);
    }

    @Test(testName = "The test adds and gets some elements in a new MyArrayList.")
    public void test01() {
        Assert.assertEquals(list.get(0), 77);
        Assert.assertEquals(list.get(1), 22);
        Assert.assertEquals(list.get(2), 88);
    }

    @Test(testName = "The test got the size of MyArrayList correct.")
    public void test02() {
        Assert.assertEquals(list.size(), 3);
    }

    @Test(testName = "The test throws IndexOutOfBoundsException when the index is out of range.", expectedExceptions = IndexOutOfBoundsException.class)
    public void test03() {
        list.get(5);
    }

    @Test(testName = "The test the size equals 0 after clear the list.")
    public void test04() {
        list.clear();
        Assert.assertEquals(0, list.size());
    }

    @Test(testName = "The test throws IndexOutOfBoundsException when get element by index after clear the list.")
    public void test05() {
        list.clear();
        Assert.expectThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test(testName = "The test MyArrayList auto increase capacity.")
    public void test06() {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Assert.assertEquals(13, list.size());
        Assert.assertEquals(9, list.get(12));
    }

    @Test(testName = "The test remove element from list.")
    public void test07() {
        // remove middle
        Integer removedElement = list.remove(1);
        Assert.assertEquals(22, removedElement);
        System.out.println(list);
        list.add(0);
        list.add(1);
        list.add(2);
        // remove last
        removedElement = list.remove(4);
        Assert.assertEquals(2, removedElement);
        System.out.println(list);;
        // remove first
        removedElement = list.remove(0);
        Assert.assertEquals(77, removedElement);
        System.out.println(list);
        Assert.assertEquals(3, list.size());
    }

    @Test(testName = "The test set a new element into list.")
    public void test08() {
        Integer oldElement = list.set(1, 99);
        Assert.assertEquals(oldElement, 22);
        Assert.assertEquals(list.get(1), 99);
    }
}
