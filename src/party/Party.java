package party;

import day09.inherit.player.Player;

//플레이어 그룹
public class Party {

    private static final int NOT_FOUND = -1;

    Player[] players;
    int participation; //현재 참여 인원 수

    Party(int partyNum) {
        players = new Player[partyNum];
        System.out.println(partyNum + "인 파티가 생성되었습니다");
    }

    //파티원 추가 기능
    public void addPlayer(Player player) {

        //파티 인원수 초과 검증
        if (participation >= players.length) {
            System.out.printf("풀파에요~~%s님", player.getNickName());
        }

        players[participation++] = player;
        System.out.printf("%s님 파티 참여 완료!\n", player.getNickName());
    }

    //파티원 전체 정보 기능
    public void showPartyInfo() {
        System.out.printf("***** 현재 파티 정보(%d명 참여중) *****\n", participation);
        for (int i = 0; i < participation; i++) {
            players[i].info();
        }
    }

    //파티원 추방 기능
    public void kickPlayer(String kickTargetName) {
        int index = findIndexPlayerNicName(kickTargetName);

        if(index != NOT_FOUND) {
            for (int i = 0; i < participation -1; i++) {
                players[i] = players[i + 1];
            }
            participation--;
        } else {
            System.out.println();
        }
    }

    // 파티원 이름으로 인덱스 찾는 기능
    private int findIndexPlayerNicName(String targetName) {
        for (int i = 0; i < participation; i++) {
            if (targetName.equals(players[i].getNickName())) {
                return i;
            }

        }
        return  NOT_FOUND; //못찾았을 때 -1 리턴
    }
}
