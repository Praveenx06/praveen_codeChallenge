
import { useState } from "react";
import PlayerService from "../Service/PlayerService";

function AddPlayer(){
    const[players , setPlayers] = useState(
        {
            playerId : "",
            playerName : "",
            jerseyNumber : "",
            role : "",
            totalMatches : "",
            teamName : "",
            country : "",
            descrption : ""
        }
    );

    const[message, setMessage] = useState("");

    const handleChange = (e) => {
        setPlayers({...players,[e.target.name]:e.target.value});       
    };

    const handlersubmit = (e) => {
        e.preventDefault();
        PlayerService.addPlayer(players)
        .then((response)=>{
            setMessage("player Added successfully ");
            setPlayers({playerId: "",playerName: "",jerseyNumber: "",role: "",totalMatches:"",teamName:"",country:"",descrption:""})
        })
        .catch((error)=>{
            console.error(error);
            setMessage("player adding has a error");
        });
    };

    return(
        <div className="container">
            <h2 className="fw-bold"> Add a new Player</h2>
            <form onSubmit={handlersubmit}>
                <div>
                    <label className="col-form-label">Player Id :</label>
                   <div>
                    <input type="text" className="form-control" name="playerId" value={players.playerId} onChange={handleChange} required/>
                   </div>
                </div>

                <div>
                    <label className="col-form-label">Player Name :</label>
                    <div>
                        <input type="text" className="form-control" name="playerName" value={players.playerName} onChange={handleChange} required/>
                    </div>
                </div>

                 <div>
                    <label className="col-form-label">Jersey Number :</label>
                    <div>
                        <input type="text" className="form-control" name="jerseyNumber" value={players.jerseyNumber} onChange={handleChange} required/>
                    </div>
                </div>

                <div>
                    <label className="col-form-label">Role :</label>
                    <div>
                        <input type="text" className="form-control" name="role" value={players.role} onChange={handleChange} required/>
                    </div>
                </div>

                <div>
                    <label className="col-form-label">Total matches :</label>
                    <div>
                        <input type="text" className="form-control" name="totalMatches" value={players.totalMatches} onChange={handleChange} required/>
                    </div>
                </div>

                <div>
                    <label className="col-form-label">Team Name :</label>
                    <div>
                        <input type="text" className="form-control" name="teamName" value={players.teamName} onChange={handleChange} required/>
                    </div>
                </div>

                <div>
                    <label className="col-form-label">Country :</label>
                    <div>
                        <input type="text" className="form-control" name="country" value={players.country} onChange={handleChange} required/>
                    </div>
                </div>
                
                <div>
                    <label className="col-form-label">Description:</label>
                    <div>
                        <input type="text" className="form-control" name="descrption" value={players.descrption} onChange={handleChange} required/>
                    </div>
                </div>
                <div className="text-center">
                    <button type="submit" className="btn btn-success"> Add Player </button>
                </div>
            </form>
            {message && (
                <p>{message}</p>
            )}
        </div>
    );

} export default AddPlayer;