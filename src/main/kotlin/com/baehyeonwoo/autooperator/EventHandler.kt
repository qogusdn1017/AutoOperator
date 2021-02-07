/*
 * Copyright (c) 2021 BaeHyeonWoo
 *
 *  Licensed under the General Public License, Version 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/gpl-3.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.baehyeonwoo.autooperator

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

class EventHandler : Listener {
    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent) {
        e.joinMessage = "${ChatColor.YELLOW}${e.player.name}님이 서버에 접속하셨습니다!"
        e.player.sendMessage("${ChatColor.GREEN}[AutoOperator] ${ChatColor.RESET}${e.player.name}님께 자동으로 관리자 권한을 주었습니다.") // 메시지 내용들은 그냥 누가 수정 하겠지 뭐 ㅁㄴㅇㄹ
        e.player.isOp = true
    }
    @EventHandler
    fun onPlayerQuit(e: PlayerQuitEvent) {
        e.quitMessage = "${ChatColor.YELLOW}${e.player.name}님이 서버를 퇴장하셨습니다!"
        e.player.sendMessage("${ChatColor.GREEN}[AutoOperator] ${ChatColor.RESET}${e.player.name}님께 자동으로 관리자 권한을 제거하였습니다.")
        e.player.isOp = false
    }
}