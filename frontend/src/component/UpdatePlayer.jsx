

import { useState } from "react";
import PlayerService from "../Service/PlayerService";

function UpdatePlayer(){
    const[player,setPlayer] = useState({
        playerId : "",
        playerName : "",
        jerseyNumber : "",
        role : "",
       
       
    });
    const [message,setMessage] = useState();

    const handleChange = (e) => {
        setPlayer({...player,[e.target.name]: e.target.value});
    };

    const handlerUpdate = ()=>{
        if(!player.playerId){
            setMessage("Enter a player Id to update");
            return;
        }

        PlayerService.updatePlayer(player)
        .then((response) => {
            setMessage("player updated successfully");
        })
        .catch((error) => {
            console.error(error);
            setMessage("player failed to update");
            setPlayer({playerId:"",playerName:"",jerseyNumber:"",role:""})
        });
    };

    return(
        <div className="container">
            <h2 className="fw-bold"> Update an existing vehicle </h2>
            <form>
                <div>
                    <label >Player Id :</label>
                    <div>
                        <input type="text" className="form-control" name="playerId" value={player.playerId} onChange={handleChange} required/>
                    </div>
                </div>

                <div>
                    <label >Player Name :</label>
                    <div>
                        <input type="text" className="form-control" name="playerName" value={player.playerName} onChange={handleChange} required/>
                    </div>
                </div>

             <div>
                    <label >Jersey Number :</label>
                    <div>
                        <input type="text" className="form-control" name="jerseyNumber" value={player.jerseyNumber} onChange={handleChange} required/>
                    </div>
                </div>

                <div>
                    <label >Role :</label>
                    <div>
                        <input type="text" className="form-control" name="role" value={player.role} onChange={handleChange} required/>
                    </div>
                </div>

               

                <div className="text-center">
                    <button type="button" className="btn btn-primary" onClick={handlerUpdate}> Update Player</button>

                </div>

                

            </form>
            {message && (
                <p>{message}</p>
            )}
        </div>


    );
}
export default UpdatePlayer;