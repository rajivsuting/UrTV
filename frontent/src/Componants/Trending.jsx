import { Box } from '@chakra-ui/react'
import React from 'react'
import MovieCard from './MovieCard'

const Trending = () => {
    const dummyArr = [
        {
            image:"https://www.filmibeat.com/img/320x100x392/popcorn/trending_news/official-release-for-shazam-2-announced-6663.jpg",
            name:"Shazami",
            year:"2023",
            country:"USA"
        },
        {
            image:"https://assets.gadgets360cdn.com/pricee/assets/product/202212/babylon_poster_1672374652.jpeg",
            name:"Babylon",
            year:"2021",
            country:"Russia"
        },
        {
            image:"https://assets.gadgets360cdn.com/pricee/assets/product/202212/Plane_1672382089.jpg",
            name:"Plane",
            year:"2022",
            country:"UK"
        },
        {
            image:"https://nettv4u.com/fileman/Uploads/10-Upcoming-Hollywood-movies/image017.jpg",
            name:"POPEYE",
            year:"2023",
            country:"India"
        },
        {
            image:"https://nettv4u.com/fileman/Uploads/10-Upcoming-Hollywood-movies/image017.jpg",
            name:"POPEYE",
            year:"2023",
            country:"India"
        },
        {
            image:"https://nettv4u.com/fileman/Uploads/10-Upcoming-Hollywood-movies/image017.jpg",
            name:"POPEYE",
            year:"2023",
            country:"India"
        },
        
    ]
  return (
    <Box>
        <Box w={"80%"} m={"auto"} fontSize={"30px"} mb={"15px"} color={'white'}>Trending</Box>
        <Box w={"80%"} display={"grid"} gridTemplateColumns={"repeat(6,1fr)"} m={"auto"} gap={"10px"}>
            {
                dummyArr.map((el)=>{
                    return (
                        <MovieCard key={el.id} image={el.image} name={el.name} year={el.year} country={el.country}/>
                    )
                })
            }
        </Box>
    </Box>
  )
}

export default Trending
