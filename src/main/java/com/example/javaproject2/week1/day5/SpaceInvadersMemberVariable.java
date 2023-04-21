package com.example.javaproject2.week1.day5;

public class SpaceInvadersMemberVariable {
        int location; // 멤버 변수 선언
        public void moveLeft() {
// 왼쪽으로 이동하는 메소드
            location = location - 1; // 기존 값에 -1
            System.out.printf("moveLeft:\n", location);
        }
        public void moveRight() {
// 오른쪽으로 이동하는 메소드
            location = location + 1; // 기존 값에 +1
            System.out.printf("moveRight:\n", location);
        }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft();
        simv.moveLeft();
        simv.moveLeft();

        System.out.printf("최종위치: %d", simv.location);
        simv.moveRight();

        System.out.printf("최종위치: %d", simv.location);

    }

}


