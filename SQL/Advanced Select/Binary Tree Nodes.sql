/*
You are given a table, BST, containing two columns: N and P, where N represents the value of a node in Binary Tree, and P is the parent of N.



Write a query to find the node type of Binary Tree ordered by the value of the node. Output one of the following for each node:

Root: If node is root node.
Leaf: If node is leaf node.
Inner: If node is neither root nor leaf node.
Sample Input



Sample Output

1 Leaf
2 Inner
3 Leaf
5 Root
6 Leaf
8 Inner
9 Leaf

Explanation

The Binary Tree below illustrates the sample:


*/
SELECT N, 
        CASE
        WHEN P IS NULL THEN 'Root'
        WHEN N IN (SELECT P FROM BST ) THEN 'Inner'
        ELSE 'Leaf'
        END
FROM BST
ORDER BY N;


/* Another Method  if example  mysql */

SELECT N, 
        IF(P IS NULL, 'Root', IF(N IN (SELECT P FROM BST), 'Inner', 'Leaf'))
FROM BST
ORDER BY N;

/* ANOTHER METHOD WHICH I DIDNT UNDERSTOOD B.N :( */
SELECT N, 
    IF (P IS NULL, 'Root', IF((SELECT COUNT(*) FROM BST WHERE P=B.N)>0,'Inner','Leaf')) 
FROM BST AS B 
ORDER BY N;

