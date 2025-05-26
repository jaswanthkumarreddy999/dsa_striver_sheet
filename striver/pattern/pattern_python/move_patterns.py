import os
import shutil

# Define the pattern categories and their ranges
categories = {
    'basic_patterns': (1, 5),
    'intermediate_patterns': (6, 10),
    'advanced_patterns': (11, 15),
    'expert_patterns': (16, 22)
}

# Current directory
current_dir = os.path.dirname(os.path.abspath(__file__))

# Move each pattern file to its appropriate directory
for pattern_num in range(1, 23):
    source_file = f'pattern{pattern_num}.py'
    if os.path.exists(source_file):
        # Determine the category
        for category, (start, end) in categories.items():
            if start <= pattern_num <= end:
                target_dir = os.path.join(current_dir, category)
                target_file = os.path.join(target_dir, source_file)
                shutil.move(source_file, target_file)
                print(f'Moved {source_file} to {category}/')
                break 