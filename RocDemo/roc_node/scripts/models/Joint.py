class Joint:
    def __init__(self, name, min_angle: float, max_angle: float):
        self.name = name
        self.min_angle = min_angle
        self.max_angle = max_angle