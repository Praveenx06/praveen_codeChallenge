
import http from '../common-http'
class PlayerService {
    getAllPlayers () {
        return http.get("/players/getall")
    }

    addPlayer(data){
        return http.post("/players/add",data)
    }

    updatePlayer(data){
        return http.put("/players/update",data)
    }

    getTeamMatches() {
    return http.get("/players/team-matches");
}
}
export default new PlayerService();