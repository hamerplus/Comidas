CREATE TABLE IF NOT EXISTS CARS_MOVIES_ENTITY (
                                    id UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
                                    Comidas_Name VARCHAR(255) NOT NULL,
                                    Comida_Receta VARCHAR(50) NOT NULL,
                                    Comida_precio INTEGER NOT NULL
);
