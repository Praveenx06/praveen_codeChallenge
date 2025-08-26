import { useState } from "react";
import PlayerService from "../Service/PlayerService";


function GetAll(){

    const[players , setPlayers] = useState([]);
    
    const loadPlayers = () => {
        PlayerService.getAllPlayers()
        .then(
            (response) =>{
                setPlayers(response.data);
            }
        )
        .catch(
            (error) => console.log(error)
        );
    };

    return (

        <div className="container">
            <h2 className="fw-bold"> Player List  </h2>

            <div>
                <button className="btn btn-primary " onClick={loadPlayers}> Get All Players </button>
            </div>

            {players.length > 0 && (
                <table className="table table-bordered table-striped table-hover">
                    <thead className="table-dark">
                        <tr>
                            <th>PlayerId</th>
                            <th>PlayerName</th>
                            <th>JerseyNumber</th>
                            <th>Role</th>
                           
                        </tr>
                    </thead>

                    <tbody>
                        { players.map((player)=>(
                            <tr key={player.playerId}>
                                <td>{player.playerId}</td>
                                 <td>{player.playerName}</td>
                                  <td>{player.jerseyNumber}</td>
                                   <td>{player.role}</td>  
                                  
                            </tr>
                        ) )
                        }
                    </tbody>
                </table>
            )
            }
        </div>
    );

} 
export default GetAll;